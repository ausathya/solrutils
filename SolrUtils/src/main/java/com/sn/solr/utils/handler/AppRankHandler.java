/*
 * Copyright 20011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sn.solr.utils.handler;

import org.apache.solr.handler.StandardRequestHandler;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.response.SolrQueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * As of now just a test handler.
 * 
 * @author Sathiya N Sundararjan
 * @since 0.1.0
 */
public class AppRankHandler extends StandardRequestHandler {

	private static final Logger LOG = LoggerFactory.getLogger(AppRankHandler.class);
	
	public void handleRequestBody(SolrQueryRequest request, SolrQueryResponse response) throws Exception {
		super.handleRequestBody(request, response);
		LOG.info("[AppRankHandler] - Completed Processing Request.");
	}
}
