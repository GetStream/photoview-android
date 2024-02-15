/*
 * Copyright 2024 Stream.IO, Inc.
 * Copyright 2011, 2012 Chris Banes.
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
package io.getstream.photoview

/**
 * Interface definition for a callback to be invoked when the photo is experiencing a drag event
 */
public fun interface OnViewDragListener {
  /**
   * Callback for when the photo is experiencing a drag event. This cannot be invoked when the
   * user is scaling.
   *
   * @param dx The change of the coordinates in the x-direction
   * @param dy The change of the coordinates in the y-direction
   */
  public fun onDrag(dx: Float, dy: Float)
}
