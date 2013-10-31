/*
 * Copyright (C) 2010 The Libphonenumber Authors
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

/* This file is automatically generated by {@link BuildMetadataProtoFromXml}.
 * Please don't modify it directly.
 */

package com.android.i18n.phonenumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryCodeToRegionCodeMapForTesting {
  // A mapping from a country code to the region codes which denote the
  // country/region represented by that country code. In the case of multiple
  // countries sharing a calling code, such as the NANPA countries, the one
  // indicated with "isMainCountryForCode" in the metadata should be first.
  static Map<Integer, List<String>> getCountryCodeToRegionCodeMap() {
    // The capacity is set to 28 as there are 21 different entries,
    // and this offers a load factor of roughly 0.75.
    Map<Integer, List<String>> countryCodeToRegionCodeMap =
        new HashMap<Integer, List<String>>(28);

    ArrayList<String> listWithRegionCode;

    listWithRegionCode = new ArrayList<String>(2);
    listWithRegionCode.add("US");
    listWithRegionCode.add("BS");
    countryCodeToRegionCodeMap.put(1, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("FR");
    countryCodeToRegionCodeMap.put(33, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IT");
    countryCodeToRegionCodeMap.put(39, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(2);
    listWithRegionCode.add("GB");
    listWithRegionCode.add("GG");
    countryCodeToRegionCodeMap.put(44, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PL");
    countryCodeToRegionCodeMap.put(48, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("DE");
    countryCodeToRegionCodeMap.put(49, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MX");
    countryCodeToRegionCodeMap.put(52, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AR");
    countryCodeToRegionCodeMap.put(54, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BR");
    countryCodeToRegionCodeMap.put(55, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AU");
    countryCodeToRegionCodeMap.put(61, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NZ");
    countryCodeToRegionCodeMap.put(64, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SG");
    countryCodeToRegionCodeMap.put(65, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("JP");
    countryCodeToRegionCodeMap.put(81, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KR");
    countryCodeToRegionCodeMap.put(82, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AO");
    countryCodeToRegionCodeMap.put(244, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(2);
    listWithRegionCode.add("RE");
    listWithRegionCode.add("YT");
    countryCodeToRegionCodeMap.put(262, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BY");
    countryCodeToRegionCodeMap.put(375, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AD");
    countryCodeToRegionCodeMap.put(376, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("001");
    countryCodeToRegionCodeMap.put(800, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AE");
    countryCodeToRegionCodeMap.put(971, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("001");
    countryCodeToRegionCodeMap.put(979, listWithRegionCode);

    return countryCodeToRegionCodeMap;
  }
}
