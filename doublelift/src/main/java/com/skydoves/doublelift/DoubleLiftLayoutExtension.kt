/*
 * Designed and developed by 2019 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package com.skydoves.doublelift

import android.content.Context

/** creates an instance of [DoubleLiftLayout] by [DoubleLiftLayout.Builder] using kotlin dsl. */
fun doubleLiftLayout(context: Context, block: DoubleLiftLayout.Builder.() -> Unit): DoubleLiftLayout =
  DoubleLiftLayout.Builder(context).apply(block).build()
