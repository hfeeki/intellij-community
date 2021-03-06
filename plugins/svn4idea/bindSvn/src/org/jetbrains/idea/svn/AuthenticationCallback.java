/*
 * Copyright 2000-2013 JetBrains s.r.o.
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
package org.jetbrains.idea.svn;

import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Irina.Chernushina
 * Date: 2/26/13
 * Time: 1:05 PM
 */
public interface AuthenticationCallback {
  /**
   * @return false if authentication canceled
   */
  boolean authenticateFor(String realm, File base, boolean previousFailed, boolean passwordRequest);
  @Nullable
  File getSpecialConfigDir();

  boolean acceptSSLServerCertificate(String url, final String realm);

  boolean acceptSSLServerCertificate(File file, final String realm);

  void clearPassiveCredentials(String realm, File base, boolean password);
}
