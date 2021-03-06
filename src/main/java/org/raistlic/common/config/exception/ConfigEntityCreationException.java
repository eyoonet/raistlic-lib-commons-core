/*
 * Copyright 2015 Lei CHEN (raistlic@gmail.com)
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

package org.raistlic.common.config.exception;

/**
 * @author lei.c (2015-12-21)
 */
public class ConfigEntityCreationException extends ConfigException {

  public ConfigEntityCreationException(String message) {

    super(message);
  }

  public ConfigEntityCreationException(String message, Throwable cause) {

    super(message, cause);
  }

  public ConfigEntityCreationException(Throwable cause) {

    super(cause);
  }
}
