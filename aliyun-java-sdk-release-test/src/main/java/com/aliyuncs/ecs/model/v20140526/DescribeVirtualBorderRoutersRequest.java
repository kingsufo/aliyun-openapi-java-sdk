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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeVirtualBorderRoutersRequest extends RpcAcsRequest<DescribeVirtualBorderRoutersResponse> {
	
	public DescribeVirtualBorderRoutersRequest() {
		super("Ecs", "2014-05-26", "DescribeVirtualBorderRouters", "ecs");
	}

	private List<Filter> filters;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Integer pageSize;

	private Long ownerId;

	private Integer pageNumber;

	public List<Filter> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filter> filter) {
		this.filters = filter;	
		for (int i = 0; i < filter.size(); i++) {
			putQueryParameter("Filter." + (i + 1) + ".Key" , filter.get(i).getKey());
			for (int j = 0; j < filter.get(i).getValues().size(); j++) {
				putQueryParameter("Filter." + (i + 1) + ".Value." +(j + 1), filter.get(i).getValues().get(j));
			}
		}	
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public static class Filter {

		private String key;

		private List<String> values;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}
	}

	@Override
	public Class<DescribeVirtualBorderRoutersResponse> getResponseClass() {
		return DescribeVirtualBorderRoutersResponse.class;
	}

}
