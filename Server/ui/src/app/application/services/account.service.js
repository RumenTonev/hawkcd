/* Copyright (C) 2016 R&D Solutions Ltd.
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

'use strict';

angular
    .module('hawk')
    .factory('accountService', ['$http', '$q', 'CONSTANTS', function ($http, $q, CONSTANTS) {
        var accountService = this;
        var registerEndPoint = CONSTANTS.BASE_URL + '/Account' + '/Register';

        //register
        accountService.registerUser = function (user) {
            var defer = $q.defer();

            $http.post(registerEndPoint, user)
                .success(function (res) {
                    defer.resolve(res);
                })
                .error(function (err, status) {
                    defer.reject(err);
                });

            return defer.promise;
        };


        return accountService;
    }]);
