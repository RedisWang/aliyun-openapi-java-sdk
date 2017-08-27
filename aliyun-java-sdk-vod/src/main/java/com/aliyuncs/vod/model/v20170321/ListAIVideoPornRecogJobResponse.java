/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListAIVideoPornRecogJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAIVideoPornRecogJobResponse extends AcsResponse {

	private String requestId;

	private List<AIVideoPornRecogJob> aIVideoPornRecogJobList;

	private List<String> nonExistPornRecogJobIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AIVideoPornRecogJob> getAIVideoPornRecogJobList() {
		return this.aIVideoPornRecogJobList;
	}

	public void setAIVideoPornRecogJobList(List<AIVideoPornRecogJob> aIVideoPornRecogJobList) {
		this.aIVideoPornRecogJobList = aIVideoPornRecogJobList;
	}

	public List<String> getNonExistPornRecogJobIds() {
		return this.nonExistPornRecogJobIds;
	}

	public void setNonExistPornRecogJobIds(List<String> nonExistPornRecogJobIds) {
		this.nonExistPornRecogJobIds = nonExistPornRecogJobIds;
	}

	public static class AIVideoPornRecogJob {

		private String id;

		private String status;

		private String code;

		private String message;

		private String creationTime;

		private String data;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}
	}

	@Override
	public ListAIVideoPornRecogJobResponse getInstance(UnmarshallerContext context) {
		return	ListAIVideoPornRecogJobResponseUnmarshaller.unmarshall(this, context);
	}
}
