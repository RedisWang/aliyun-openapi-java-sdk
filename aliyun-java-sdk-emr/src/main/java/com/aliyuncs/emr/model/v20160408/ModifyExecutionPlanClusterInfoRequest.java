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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyExecutionPlanClusterInfoRequest extends RpcAcsRequest<ModifyExecutionPlanClusterInfoResponse> {
	
	public ModifyExecutionPlanClusterInfoRequest() {
		super("Emr", "2016-04-08", "ModifyExecutionPlanClusterInfo");
	}

	private Long resourceOwnerId;

	private String logPath;

	private String clusterName;

	private String configurations;

	private Boolean ioOptimized;

	private String securityGroupId;

	private Boolean easEnable;

	private Boolean createClusterOnDemand;

	private List<BootstrapAction> bootstrapActions;

	private Boolean useLocalMetaDb;

	private String emrVer;

	private String id;

	private Boolean isOpenPublicIp;

	private String clusterId;

	private String instanceGeneration;

	private String clusterType;

	private String vSwitchId;

	private List<String> optionSoftWareLists;

	private String vpcId;

	private String netType;

	private List<EcsOrder> ecsOrders;

	private String zoneId;

	private Boolean highAvailabilityEnable;

	private Boolean logEnable;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getLogPath() {
		return this.logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
		if(logPath != null){
			putQueryParameter("LogPath", logPath);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public String getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(String configurations) {
		this.configurations = configurations;
		if(configurations != null){
			putQueryParameter("Configurations", configurations);
		}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public Boolean getEasEnable() {
		return this.easEnable;
	}

	public void setEasEnable(Boolean easEnable) {
		this.easEnable = easEnable;
		if(easEnable != null){
			putQueryParameter("EasEnable", easEnable.toString());
		}
	}

	public Boolean getCreateClusterOnDemand() {
		return this.createClusterOnDemand;
	}

	public void setCreateClusterOnDemand(Boolean createClusterOnDemand) {
		this.createClusterOnDemand = createClusterOnDemand;
		if(createClusterOnDemand != null){
			putQueryParameter("CreateClusterOnDemand", createClusterOnDemand.toString());
		}
	}

	public List<BootstrapAction> getBootstrapActions() {
		return this.bootstrapActions;
	}

	public void setBootstrapActions(List<BootstrapAction> bootstrapActions) {
		this.bootstrapActions = bootstrapActions;	
		if (bootstrapActions != null) {
			for (int depth1 = 0; depth1 < bootstrapActions.size(); depth1++) {
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Path" , bootstrapActions.get(depth1).getPath());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Arg" , bootstrapActions.get(depth1).getArg());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Name" , bootstrapActions.get(depth1).getName());
			}
		}	
	}

	public Boolean getUseLocalMetaDb() {
		return this.useLocalMetaDb;
	}

	public void setUseLocalMetaDb(Boolean useLocalMetaDb) {
		this.useLocalMetaDb = useLocalMetaDb;
		if(useLocalMetaDb != null){
			putQueryParameter("UseLocalMetaDb", useLocalMetaDb.toString());
		}
	}

	public String getEmrVer() {
		return this.emrVer;
	}

	public void setEmrVer(String emrVer) {
		this.emrVer = emrVer;
		if(emrVer != null){
			putQueryParameter("EmrVer", emrVer);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public Boolean getIsOpenPublicIp() {
		return this.isOpenPublicIp;
	}

	public void setIsOpenPublicIp(Boolean isOpenPublicIp) {
		this.isOpenPublicIp = isOpenPublicIp;
		if(isOpenPublicIp != null){
			putQueryParameter("IsOpenPublicIp", isOpenPublicIp.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getInstanceGeneration() {
		return this.instanceGeneration;
	}

	public void setInstanceGeneration(String instanceGeneration) {
		this.instanceGeneration = instanceGeneration;
		if(instanceGeneration != null){
			putQueryParameter("InstanceGeneration", instanceGeneration);
		}
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public List<String> getOptionSoftWareLists() {
		return this.optionSoftWareLists;
	}

	public void setOptionSoftWareLists(List<String> optionSoftWareLists) {
		this.optionSoftWareLists = optionSoftWareLists;	
		if (optionSoftWareLists != null) {
			for (int i = 0; i < optionSoftWareLists.size(); i++) {
				putQueryParameter("OptionSoftWareList." + (i + 1) , optionSoftWareLists.get(i));
			}
		}	
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType);
		}
	}

	public List<EcsOrder> getEcsOrders() {
		return this.ecsOrders;
	}

	public void setEcsOrders(List<EcsOrder> ecsOrders) {
		this.ecsOrders = ecsOrders;	
		if (ecsOrders != null) {
			for (int depth1 = 0; depth1 < ecsOrders.size(); depth1++) {
				putQueryParameter("EcsOrder." + (depth1 + 1) + ".NodeType" , ecsOrders.get(depth1).getNodeType());
				putQueryParameter("EcsOrder." + (depth1 + 1) + ".DiskCount" , ecsOrders.get(depth1).getDiskCount());
				putQueryParameter("EcsOrder." + (depth1 + 1) + ".NodeCount" , ecsOrders.get(depth1).getNodeCount());
				putQueryParameter("EcsOrder." + (depth1 + 1) + ".DiskCapacity" , ecsOrders.get(depth1).getDiskCapacity());
				putQueryParameter("EcsOrder." + (depth1 + 1) + ".Index" , ecsOrders.get(depth1).getIndex());
				putQueryParameter("EcsOrder." + (depth1 + 1) + ".InstanceType" , ecsOrders.get(depth1).getInstanceType());
				putQueryParameter("EcsOrder." + (depth1 + 1) + ".DiskType" , ecsOrders.get(depth1).getDiskType());
			}
		}	
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Boolean getHighAvailabilityEnable() {
		return this.highAvailabilityEnable;
	}

	public void setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
		this.highAvailabilityEnable = highAvailabilityEnable;
		if(highAvailabilityEnable != null){
			putQueryParameter("HighAvailabilityEnable", highAvailabilityEnable.toString());
		}
	}

	public Boolean getLogEnable() {
		return this.logEnable;
	}

	public void setLogEnable(Boolean logEnable) {
		this.logEnable = logEnable;
		if(logEnable != null){
			putQueryParameter("LogEnable", logEnable.toString());
		}
	}

	public static class BootstrapAction {

		private String path;

		private String arg;

		private String name;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getArg() {
			return this.arg;
		}

		public void setArg(String arg) {
			this.arg = arg;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class EcsOrder {

		private String nodeType;

		private Integer diskCount;

		private Integer nodeCount;

		private Integer diskCapacity;

		private Integer index;

		private String instanceType;

		private String diskType;

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public Integer getDiskCount() {
			return this.diskCount;
		}

		public void setDiskCount(Integer diskCount) {
			this.diskCount = diskCount;
		}

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public Integer getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Integer diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}
	}

	@Override
	public Class<ModifyExecutionPlanClusterInfoResponse> getResponseClass() {
		return ModifyExecutionPlanClusterInfoResponse.class;
	}

}
