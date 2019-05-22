package accubits.com.dynamic_feature_three.common

import java.lang.ref.WeakReference

/*
 * Copyright 2015 Hannes Dorfmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

open class MvpBasePresenter<V : MvpView> : MvpPresenter<V> {

    private var viewRef: WeakReference<V>? = null

    /**
     * Get the attached view. You should always call [.isViewAttached] to check if the view
     * is
     * attached to avoid NullPointerExceptions.
     *
     * @return `null`, if view is not attached, otherwise the concrete view instance
     */
    val view: V?
        get() = if (viewRef == null) null else viewRef!!.get()

    /**
     * Checks if a view is attached to this presenter. You should always call this method before
     * calling [.getView] to get the view instance.
     */
    val isViewAttached: Boolean
        get() = viewRef != null && viewRef!!.get() != null

    override fun attachView(view: V) {
        viewRef = WeakReference(view)
    }

    override fun detachView(retainInstance: Boolean) {
        if (viewRef != null) {
            viewRef!!.clear()
            viewRef = null
        }
    }


}