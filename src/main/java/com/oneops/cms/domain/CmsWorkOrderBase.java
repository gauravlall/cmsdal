/*******************************************************************************
 *
 *   Copyright 2015 Walmart, Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *******************************************************************************/
package com.oneops.cms.domain;

import com.oneops.cms.cm.domain.CmsCI;
import java.util.List;
import java.util.Map;

/**
 * The Interface CmsWorkOrderBase.
 */
public interface CmsWorkOrderBase<T> {

  CmsCI getBox();

  void setBox(CmsCI box);

  CmsCI getResultCi();

  void setResultCi(CmsCI resultCi);

  CmsCI getCloud();

  void setCloud(CmsCI cloud);

  Map<String, Map<String, CmsCI>> getServices();

  void setServices(Map<String, Map<String, CmsCI>> services);

  /**
   * Gets the pay load.
   *
   * @return the pay load
   */
  Map<String, List<T>> getPayLoad();

  /**
   * Gets the pay load.
   *
   * @return the pay load
   */
  List<T> getPayLoadEntry(String payloadKey);

  String getAction();

  String getNsPath();

  String getClassName();

  long getCiId();

  String getCiName();

  long getDeploymentId();

  void putPayLoadEntry(String payloadEntry, List<T> entries);


  /**
   * Gets the pay load.
   *
   * @return the pay load
   */
  T getPayLoadEntryAt(String payloadKey, int indx);

  default boolean isPayLoadEntryPresent(String entry) {
    return getPayLoad() != null && getPayLoadEntry(entry) != null
        && getPayLoadEntry(entry).size() > 0;
  }


}
