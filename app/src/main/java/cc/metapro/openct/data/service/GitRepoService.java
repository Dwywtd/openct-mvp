package cc.metapro.openct.data.service;

/*
 *  Copyright 2016 - 2017 OpenCT open source class table
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.List;

import cc.metapro.openct.LoginConfig;
import cc.metapro.openct.data.university.UniversityInfo;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitRepoService {

    @GET("schools.json")
    Observable<List<UniversityInfo>> getUniversityInfo();

    @GET("login/{school}")
    Observable<LoginConfig> getLoginConfigOf(@Path("school") String school);
}