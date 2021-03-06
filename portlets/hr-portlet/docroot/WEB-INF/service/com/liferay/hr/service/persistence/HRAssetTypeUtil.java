/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.hr.service.persistence;

import com.liferay.hr.model.HRAssetType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the h r asset type service. This utility wraps {@link HRAssetTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Wesley Gong
 * @see HRAssetTypePersistence
 * @see HRAssetTypePersistenceImpl
 * @generated
 */
public class HRAssetTypeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(HRAssetType hrAssetType) {
		getPersistence().clearCache(hrAssetType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HRAssetType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HRAssetType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HRAssetType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static HRAssetType remove(HRAssetType hrAssetType)
		throws SystemException {
		return getPersistence().remove(hrAssetType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static HRAssetType update(HRAssetType hrAssetType, boolean merge)
		throws SystemException {
		return getPersistence().update(hrAssetType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static HRAssetType update(HRAssetType hrAssetType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hrAssetType, merge, serviceContext);
	}

	/**
	* Caches the h r asset type in the entity cache if it is enabled.
	*
	* @param hrAssetType the h r asset type
	*/
	public static void cacheResult(com.liferay.hr.model.HRAssetType hrAssetType) {
		getPersistence().cacheResult(hrAssetType);
	}

	/**
	* Caches the h r asset types in the entity cache if it is enabled.
	*
	* @param hrAssetTypes the h r asset types
	*/
	public static void cacheResult(
		java.util.List<com.liferay.hr.model.HRAssetType> hrAssetTypes) {
		getPersistence().cacheResult(hrAssetTypes);
	}

	/**
	* Creates a new h r asset type with the primary key. Does not add the h r asset type to the database.
	*
	* @param hrAssetTypeId the primary key for the new h r asset type
	* @return the new h r asset type
	*/
	public static com.liferay.hr.model.HRAssetType create(long hrAssetTypeId) {
		return getPersistence().create(hrAssetTypeId);
	}

	/**
	* Removes the h r asset type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrAssetTypeId the primary key of the h r asset type
	* @return the h r asset type that was removed
	* @throws com.liferay.hr.NoSuchAssetTypeException if a h r asset type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRAssetType remove(long hrAssetTypeId)
		throws com.liferay.hr.NoSuchAssetTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(hrAssetTypeId);
	}

	public static com.liferay.hr.model.HRAssetType updateImpl(
		com.liferay.hr.model.HRAssetType hrAssetType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hrAssetType, merge);
	}

	/**
	* Returns the h r asset type with the primary key or throws a {@link com.liferay.hr.NoSuchAssetTypeException} if it could not be found.
	*
	* @param hrAssetTypeId the primary key of the h r asset type
	* @return the h r asset type
	* @throws com.liferay.hr.NoSuchAssetTypeException if a h r asset type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRAssetType findByPrimaryKey(
		long hrAssetTypeId)
		throws com.liferay.hr.NoSuchAssetTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(hrAssetTypeId);
	}

	/**
	* Returns the h r asset type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrAssetTypeId the primary key of the h r asset type
	* @return the h r asset type, or <code>null</code> if a h r asset type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRAssetType fetchByPrimaryKey(
		long hrAssetTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hrAssetTypeId);
	}

	/**
	* Returns all the h r asset types.
	*
	* @return the h r asset types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRAssetType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the h r asset types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r asset types
	* @param end the upper bound of the range of h r asset types (not inclusive)
	* @return the range of h r asset types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRAssetType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the h r asset types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r asset types
	* @param end the upper bound of the range of h r asset types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r asset types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRAssetType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the h r asset types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of h r asset types.
	*
	* @return the number of h r asset types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HRAssetTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HRAssetTypePersistence)PortletBeanLocatorUtil.locate(com.liferay.hr.service.ClpSerializer.getServletContextName(),
					HRAssetTypePersistence.class.getName());

			ReferenceRegistry.registerReference(HRAssetTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(HRAssetTypePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(HRAssetTypeUtil.class,
			"_persistence");
	}

	private static HRAssetTypePersistence _persistence;
}