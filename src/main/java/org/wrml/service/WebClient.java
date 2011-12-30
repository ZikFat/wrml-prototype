/**
 * Copyright (C) 2011 WRML.org <mark@wrml.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wrml.service;

import java.net.URI;
import java.util.Map;
import java.util.Set;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import org.wrml.Model;
import org.wrml.model.Action;
import org.wrml.runtime.Context;
import org.wrml.util.transformer.UriTransformer;

/*
 * Implements the service interface with a REST API client.
 * 
 * TODO: This is all still very "alpha" - optimize at will.
 */
public class WebClient extends AbstractExecutableService {

    private HttpClient _HttpClient;

    public WebClient(Context context) {
        super(context);

        _HttpClient = new DefaultHttpClient();
    }

    @Override
    public void clear() {

        /*
         * TODO: Design question - Does clear make any sense for a REST API? If
         * not, should we throw an exception?
         */

        super.clear();
    }

    @Override
    public boolean containsKey(Object key) {

        /*
         * TODO: Design proposal - A HEAD request and check for 200 success?
         */

        return super.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {

        /*
         * TODO: Design proposal - A HEAD request and check for 200 success?
         * Using the Model's (Document's) id?
         */

        return super.containsValue(value);
    }

    public Object create(Model referrer) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Set<java.util.Map.Entry<URI, Object>> entrySet() {

        /*
         * TODO: Not really possible without a URI. Should we throw an
         * exception?
         */

        return super.entrySet();
    }

    @Override
    public Object execute(URI id, Action action, Model referrer) {

        /*
         * TODO: HTTP POST an action
         */

        return null;
    }

    public Object get(URI id, Model referrer) {

        /*
         * TODO: HTTP GET
         */

        return null;
    }

    public UriTransformer<URI> getIdTransformer() {
        // By default, this service treat's URIs as native identifiers, 
        // therefore we can use a passthrough transformer.

        return PassthroughUriTransformer.Instance;
    }

    @Override
    public boolean isEmpty() {

        /*
         * TODO: Not really possible without a URI. Should we throw an
         * exception?
         */

        return super.isEmpty();
    }

    @Override
    public Set<URI> keySet() {

        /*
         * TODO: Not really possible without a URI. Should we throw an
         * exception?
         */

        return super.keySet();
    }

    public Object put(URI id, Object requestEntity, Model referrer) {
        /*
         * TODO: HTTP PUT
         */

        return null;
    }

    @Override
    public void putAll(Map<? extends URI, ? extends Object> map) {

        /*
         * TODO: HTTP PUT (batch/transactional?)
         */

        super.putAll(map);
    }

    public Object remove(URI id, Model referrer) {
        /*
         * TODO: HTTP DELETE
         */
        return null;
    }

    @Override
    public int size() {
        /*
         * TODO: Not really possible without a URI. Should we throw an
         * exception?
         */
        return super.size();
    }

    @Override
    public java.util.Collection<Object> values() {
        /*
         * TODO: Not really possible without a URI. Should we throw an
         * exception?
         */
        return super.values();
    }

    @Override
    protected void finalize() throws Throwable {

        // When HttpClient instance is no longer needed,
        // shut down the connection manager to ensure
        // immediate deallocation of all system resources
        _HttpClient.getConnectionManager().shutdown();

        super.finalize();
    }

    public static class PassthroughUriTransformer implements UriTransformer<URI> {

        public static final PassthroughUriTransformer Instance = new PassthroughUriTransformer();

        public URI aToB(URI aValue) {
            return aValue;
        }

        public URI bToA(URI bValue) {
            return bValue;
        }

        public Class<URI> getA() {
            return URI.class;
        }

        public Class<URI> getB() {
            return URI.class;
        }

    }

}
