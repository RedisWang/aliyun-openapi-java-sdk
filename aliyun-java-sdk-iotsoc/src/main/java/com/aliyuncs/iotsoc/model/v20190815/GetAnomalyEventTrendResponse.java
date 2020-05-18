/*
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

package com.aliyuncs.iotsoc.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotsoc.transform.v20190815.GetAnomalyEventTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAnomalyEventTrendResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<String> systemObjectTrend;

		private List<String> applicationBehaviorTrend;

		private List<String> networkFlowTrend;

		public List<String> getSystemObjectTrend() {
			return this.systemObjectTrend;
		}

		public void setSystemObjectTrend(List<String> systemObjectTrend) {
			this.systemObjectTrend = systemObjectTrend;
		}

		public List<String> getApplicationBehaviorTrend() {
			return this.applicationBehaviorTrend;
		}

		public void setApplicationBehaviorTrend(List<String> applicationBehaviorTrend) {
			this.applicationBehaviorTrend = applicationBehaviorTrend;
		}

		public List<String> getNetworkFlowTrend() {
			return this.networkFlowTrend;
		}

		public void setNetworkFlowTrend(List<String> networkFlowTrend) {
			this.networkFlowTrend = networkFlowTrend;
		}
	}

	@Override
	public GetAnomalyEventTrendResponse getInstance(UnmarshallerContext context) {
		return	GetAnomalyEventTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
