/*
 * Copyright 2017 Otavio Santana and others
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
 *
 *
 */
package org.jnosql.diana.redis.key;

/**
 * An {@link SortedSet} element
 */
public interface Ranking {

    /**
     * @return the point
     */
    Number getPoints();

    /**
     * @return the member name
     */
    String getMember();

    /**
     * Returns a {@link Ranking} instance
     *
     * @param member the member name
     * @param points the point value
     * @return the instance
     * @throws NullPointerException when either member and points are null
     */
    static Ranking of(String member, Number points) throws NullPointerException {
        return new DefaultRanking(member, points);
    }
}