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
package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Instance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String instanceId;

		private String instanceName;

		private String description;

		private String imageId;

		private String oSName;

		private String oSType;

		private String regionId;

		private String zoneId;

		private String clusterId;

		private String instanceType;

		private Integer cpu;

		private Integer memory;

		private String hostName;

		private String status;

		private String serialNumber;

		private String internetChargeType;

		private Integer internetMaxBandwidthIn;

		private Integer internetMaxBandwidthOut;

		private String vlanId;

		private String creationTime;

		private String instanceNetworkType;

		private String instanceChargeType;

		private String expiredTime;

		private String autoReleaseTime;

		private Boolean ioOptimized;

		private Boolean deviceAvailable;

		private String instanceTypeFamily;

		private Long localStorageCapacity;

		private Integer localStorageAmount;

		private Integer gPUAmount;

		private String gPUSpec;

		private String spotStrategy;

		private String keyPairName;

		private List<LockReason> operationLocks;

		private List<Tag> tags;

		private List<String> securityGroupIds;

		private List<String> networkInterfaceIds;

		private List<String> publicIpAddress;

		private List<String> innerIpAddress;

		private VpcAttributes vpcAttributes;

		private EipAddress eipAddress;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public Integer getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(String vlanId) {
			this.vlanId = vlanId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getAutoReleaseTime() {
			return this.autoReleaseTime;
		}

		public void setAutoReleaseTime(String autoReleaseTime) {
			this.autoReleaseTime = autoReleaseTime;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Boolean getDeviceAvailable() {
			return this.deviceAvailable;
		}

		public void setDeviceAvailable(Boolean deviceAvailable) {
			this.deviceAvailable = deviceAvailable;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public Long getLocalStorageCapacity() {
			return this.localStorageCapacity;
		}

		public void setLocalStorageCapacity(Long localStorageCapacity) {
			this.localStorageCapacity = localStorageCapacity;
		}

		public Integer getLocalStorageAmount() {
			return this.localStorageAmount;
		}

		public void setLocalStorageAmount(Integer localStorageAmount) {
			this.localStorageAmount = localStorageAmount;
		}

		public Integer getGPUAmount() {
			return this.gPUAmount;
		}

		public void setGPUAmount(Integer gPUAmount) {
			this.gPUAmount = gPUAmount;
		}

		public String getGPUSpec() {
			return this.gPUSpec;
		}

		public void setGPUSpec(String gPUSpec) {
			this.gPUSpec = gPUSpec;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public List<LockReason> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<LockReason> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public List<String> getNetworkInterfaceIds() {
			return this.networkInterfaceIds;
		}

		public void setNetworkInterfaceIds(List<String> networkInterfaceIds) {
			this.networkInterfaceIds = networkInterfaceIds;
		}

		public List<String> getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(List<String> publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public List<String> getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(List<String> innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public VpcAttributes getVpcAttributes() {
			return this.vpcAttributes;
		}

		public void setVpcAttributes(VpcAttributes vpcAttributes) {
			this.vpcAttributes = vpcAttributes;
		}

		public EipAddress getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(EipAddress eipAddress) {
			this.eipAddress = eipAddress;
		}

		public static class LockReason {

			private String lockReason;

			private String lockMsg;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}

			public String getLockMsg() {
				return this.lockMsg;
			}

			public void setLockMsg(String lockMsg) {
				this.lockMsg = lockMsg;
			}
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class VpcAttributes {

			private String vpcId;

			private String vSwitchId;

			private String natIpAddress;

			private List<String> privateIpAddress;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getNatIpAddress() {
				return this.natIpAddress;
			}

			public void setNatIpAddress(String natIpAddress) {
				this.natIpAddress = natIpAddress;
			}

			public List<String> getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(List<String> privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}
		}

		public static class EipAddress {

			private String allocationId;

			private String ipAddress;

			private Integer bandwidth;

			private String internetChargeType1;

			private Boolean isSupportUnassociate;

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}

			public String getIpAddress() {
				return this.ipAddress;
			}

			public void setIpAddress(String ipAddress) {
				this.ipAddress = ipAddress;
			}

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getInternetChargeType1() {
				return this.internetChargeType1;
			}

			public void setInternetChargeType1(String internetChargeType1) {
				this.internetChargeType1 = internetChargeType1;
			}

			public Boolean getIsSupportUnassociate() {
				return this.isSupportUnassociate;
			}

			public void setIsSupportUnassociate(Boolean isSupportUnassociate) {
				this.isSupportUnassociate = isSupportUnassociate;
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
