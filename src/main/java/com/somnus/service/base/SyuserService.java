package com.somnus.service.base;

import java.util.List;
import java.util.Map;

import com.somnus.model.base.Syuser;
import com.somnus.service.BaseService;

/**
 * 用户业务
 * 
 * @author Somnus
 * 
 */
public interface SyuserService extends BaseService<Syuser> {

	/**
	 * 修改用户角色
	 * 
	 * @param id
	 *            用户ID
	 * @param roleIds
	 *            角色IDS
	 */
	public void grantRole(String id, String roleIds);

	/**
	 * 修改用户机构
	 * 
	 * @param id
	 *            用户ID
	 * @param organizationIds
	 *            机构IDS
	 */
	public void grantOrganization(String id, String organizationIds);

	/**
	 * 统计用户注册时间图表
	 * 
	 * @return
	 */
	public List<Map<String,Object>> userCreateDatetimeChart();

	/**
	 * 统计?角色的用户
	 * 
	 * @param roleId
	 * @return
	 */
	public Integer countUserByRoleId(String roleId);

	/**
	 * 统计没有角色的用户数量
	 * 
	 * @return
	 */
	public Integer countUserByNotRoleId();

}
