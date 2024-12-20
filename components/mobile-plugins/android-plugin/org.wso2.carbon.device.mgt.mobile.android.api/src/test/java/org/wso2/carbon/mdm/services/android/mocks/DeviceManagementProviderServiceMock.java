/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 *  Copyright (c) 2020, Entgra (pvt) Ltd. (http://entgra.io) All Rights Reserved.
 *
 *  Entgra (pvt) Ltd. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied. See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.mdm.services.android.mocks;

import org.wso2.carbon.device.mgt.common.ActivityPaginationRequest;
import org.wso2.carbon.device.mgt.common.Device;
import org.wso2.carbon.device.mgt.common.DeviceIdentifier;
import org.wso2.carbon.device.mgt.common.DeviceTransferRequest;
import org.wso2.carbon.device.mgt.common.DynamicTaskContext;
import org.wso2.carbon.device.mgt.common.StartupOperationConfig;
import org.wso2.carbon.device.mgt.common.app.mgt.ApplicationManagementException;
import org.wso2.carbon.device.mgt.common.configuration.mgt.AmbiguousConfigurationException;
import org.wso2.carbon.device.mgt.common.configuration.mgt.ConfigurationEntry;
import org.wso2.carbon.device.mgt.common.configuration.mgt.DeviceConfiguration;
import org.wso2.carbon.device.mgt.common.device.details.DeviceData;
import org.wso2.carbon.device.mgt.common.device.details.DeviceLocationHistorySnapshot;
import org.wso2.carbon.device.mgt.common.exceptions.DeviceManagementException;
import org.wso2.carbon.device.mgt.common.EnrolmentInfo;
import org.wso2.carbon.device.mgt.common.FeatureManager;
import org.wso2.carbon.device.mgt.common.exceptions.DeviceNotFoundException;
import org.wso2.carbon.device.mgt.common.exceptions.DeviceTypeNotFoundException;
import org.wso2.carbon.device.mgt.common.exceptions.InvalidDeviceException;
import org.wso2.carbon.device.mgt.common.MonitoringOperation;
import org.wso2.carbon.device.mgt.common.OperationMonitoringTaskConfig;
import org.wso2.carbon.device.mgt.common.PaginationRequest;
import org.wso2.carbon.device.mgt.common.PaginationResult;
import org.wso2.carbon.device.mgt.common.exceptions.UnauthorizedDeviceAccessException;
import org.wso2.carbon.device.mgt.common.exceptions.UserNotFoundException;
import org.wso2.carbon.device.mgt.common.configuration.mgt.ConfigurationManagementException;
import org.wso2.carbon.device.mgt.common.configuration.mgt.PlatformConfiguration;
import org.wso2.carbon.device.mgt.common.geo.service.GeoCluster;
import org.wso2.carbon.device.mgt.common.geo.service.GeoCoordinate;
import org.wso2.carbon.device.mgt.common.geo.service.GeoQuery;
import org.wso2.carbon.device.mgt.common.invitation.mgt.DeviceEnrollmentInvitationDetails;
import org.wso2.carbon.device.mgt.common.license.mgt.License;
import org.wso2.carbon.device.mgt.common.operation.mgt.Activity;
import org.wso2.carbon.device.mgt.common.operation.mgt.Operation;
import org.wso2.carbon.device.mgt.common.operation.mgt.OperationManagementException;
import org.wso2.carbon.device.mgt.common.policy.mgt.PolicyMonitoringManager;
import org.wso2.carbon.device.mgt.common.pull.notification.PullNotificationExecutionFailedException;
import org.wso2.carbon.device.mgt.common.push.notification.NotificationStrategy;
import org.wso2.carbon.device.mgt.common.spi.DeviceManagementService;
import org.wso2.carbon.device.mgt.core.dto.DeviceType;
import org.wso2.carbon.device.mgt.core.dto.DeviceTypeVersion;


import org.wso2.carbon.device.mgt.core.service.DeviceManagementProviderService;
import org.wso2.carbon.device.mgt.core.service.EmailMetaInfo;
import org.wso2.carbon.mdm.services.android.utils.TestUtils;

import org.apache.commons.collections.map.SingletonMap;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class DeviceManagementProviderServiceMock implements DeviceManagementProviderService {

    @Override
    public List<Device> getAllDevices(String s) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getAllDevices(String s, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getAllocatedDevices(String s, int i, int i1)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getAllDevices() throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getAllDevices(boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevices(Date date) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevices(Date date, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByType(PaginationRequest paginationRequest) throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByType(PaginationRequest paginationRequest, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getAllDevices(PaginationRequest paginationRequest) throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getAllDevices(PaginationRequest paginationRequest, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier) throws DeviceManagementException {
        if (TestUtils.getDeviceId().equals(deviceIdentifier.getId())) {
            return TestUtils.getDevice();
        } else {
            return null;
        }
    }

    @Override
    public Device getDeviceWithTypeProperties(DeviceIdentifier deviceIdentifier) throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier, boolean b) throws DeviceManagementException {
        if (TestUtils.getDeviceId().equals(deviceIdentifier.getId())) {
            return TestUtils.getDevice();
        } else {
            return null;
        }
    }

    @Override
    public Device getDevice(String s, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier, String s, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier, Date date) throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier, Date date, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceData deviceData, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesBasedOnProperties(Map map) throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(String s, Date date, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier, String s, Date date, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier, EnrolmentInfo.Status status)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public Device getDevice(DeviceIdentifier deviceIdentifier, EnrolmentInfo.Status status, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesOfUser(PaginationRequest paginationRequest) throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesOfUser(PaginationRequest paginationRequest, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByOwnership(PaginationRequest paginationRequest)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByOwnership(PaginationRequest paginationRequest, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesOfUser(String s) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesOfUser(String s, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesOfUser(String s, List<String> list, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesOfUser(String s, String s1) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesOfUser(String s, String s1, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getAllDevicesOfRole(String s) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getAllDevicesOfRole(String s, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getAllDevicesOfRole(String s, List<String> list, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByStatus(PaginationRequest paginationRequest) throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByStatus(PaginationRequest paginationRequest, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesByNameAndType(PaginationRequest paginationRequest, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByName(PaginationRequest paginationRequest) throws DeviceManagementException {
        return null;
    }

    @Override
    public PaginationResult getDevicesByName(PaginationRequest paginationRequest, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesByStatus(EnrolmentInfo.Status status) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Device> getDevicesByStatus(EnrolmentInfo.Status status, boolean b) throws DeviceManagementException {
        return null;
    }

    @Override
    public int getDeviceCount(String s) throws DeviceManagementException {
        return 0;
    }

    @Override
    public int getDeviceCount() throws DeviceManagementException {
        return 0;
    }

    @Override
    public int getDeviceCount(String s, EnrolmentInfo.Status status) throws DeviceManagementException {
        return 0;
    }

    @Override
    public int getDeviceCount(EnrolmentInfo.Status status) throws DeviceManagementException {
        return 0;
    }

    @Override
    public SingletonMap getTenantedDevice(DeviceIdentifier deviceIdentifier, boolean b)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public void sendEnrolmentInvitation(String s, EmailMetaInfo emailMetaInfo)
            throws DeviceManagementException, ConfigurationManagementException {

    }

    @Override
    public void sendRegistrationEmail(EmailMetaInfo emailMetaInfo)
            throws DeviceManagementException, ConfigurationManagementException {

    }

    @Override
    public FeatureManager getFeatureManager(String s) {
        return null;
    }

    @Override
    public PlatformConfiguration getConfiguration(String s) throws DeviceManagementException {
        return null;
    }

    @Override
    public boolean isEnrolled(DeviceIdentifier deviceIdentifier, String s) throws DeviceManagementException {
        return false;
    }

    @Override
    public NotificationStrategy getNotificationStrategyByDeviceType(String s) throws DeviceManagementException {
        return null;
    }

    @Override
    public License getLicense(String s, String s1) throws DeviceManagementException {
        return null;
    }

    @Override
    public void addLicense(String s, License license) throws DeviceManagementException {

    }

    @Override
    public boolean modifyEnrollment(Device device) throws DeviceManagementException {
        return TestUtils.getDeviceId().equals(device.getDeviceIdentifier());
    }

    @Override
    public boolean enrollDevice(Device device) throws DeviceManagementException {
        return TestUtils.getDeviceId().equals(device.getDeviceIdentifier());
    }

    @Override
    public boolean saveConfiguration(PlatformConfiguration platformConfiguration) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean disenrollDevice(DeviceIdentifier deviceIdentifier) throws DeviceManagementException {
        return TestUtils.getDeviceId().equals(deviceIdentifier.getId());
    }

    @Override
    public boolean deleteDevices(List<String> list) throws DeviceManagementException, InvalidDeviceException {
        return false;
    }

    @Override
    public boolean isEnrolled(DeviceIdentifier deviceIdentifier) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean isActive(DeviceIdentifier deviceIdentifier) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean setActive(DeviceIdentifier deviceIdentifier, boolean b) throws DeviceManagementException {
        return false;
    }

    @Override
    public List<String> getAvailableDeviceTypes() throws DeviceManagementException {
        return null;
    }

    @Override
    public List<String> getPolicyMonitoringEnableDeviceTypes() throws DeviceManagementException {
        return null;
    }

    @Override
    public boolean updateDeviceInfo(DeviceIdentifier deviceIdentifier, Device device) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean setOwnership(DeviceIdentifier deviceIdentifier, String s) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean setStatus(Device device, EnrolmentInfo.Status status) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean setStatus(String s, EnrolmentInfo.Status status) throws DeviceManagementException {
        return false;
    }

    @Override
    public void notifyOperationToDevices(Operation operation, List<DeviceIdentifier> list)
            throws DeviceManagementException {
    }

    @Override
    public Activity addOperation(String s, Operation operation, List<DeviceIdentifier> list)
            throws OperationManagementException, InvalidDeviceException {
        return TestUtils.getActivity();
    }

    @Override
    public void addTaskOperation(String s, Operation operation, DynamicTaskContext dynamicTaskContext)
            throws OperationManagementException {
    }

    @Override
    public void addTaskOperation(String s, List<Device> list, Operation operation)
            throws OperationManagementException {
    }

    @Override
    public List<? extends Operation> getOperations(DeviceIdentifier deviceIdentifier)
            throws OperationManagementException {
        return null;
    }

    @Override
    public PaginationResult getOperations(DeviceIdentifier deviceIdentifier, PaginationRequest paginationRequest)
            throws OperationManagementException {
        return null;
    }

    @Override
    public List<? extends Operation> getOperations(DeviceIdentifier deviceIdentifier, Operation.Status status)
            throws OperationManagementException {
        return null;
    }

    @Override
    public List<? extends Operation> getPendingOperations(DeviceIdentifier deviceIdentifier)
            throws OperationManagementException {
        return null;
    }

    @Override
    public List<? extends Operation> getPendingOperations(Device device) throws OperationManagementException {
        return null;
    }

    @Override
    public Operation getNextPendingOperation(DeviceIdentifier deviceIdentifier) throws OperationManagementException {
        return null;
    }

    @Override
    public Operation getNextPendingOperation(DeviceIdentifier deviceIdentifier, long l)
            throws OperationManagementException {
        return null;
    }

    @Override
    public void updateOperation(DeviceIdentifier deviceIdentifier, Operation operation)
            throws OperationManagementException {

    }

    @Override
    public void updateOperation(Device device, Operation operation) throws OperationManagementException {

    }

    @Override
    public boolean updateProperties(DeviceIdentifier deviceIdentifier, List<Device.Property> list)
            throws DeviceManagementException {
        return false;
    }

    @Override
    public Operation getOperationByDeviceAndOperationId(DeviceIdentifier deviceIdentifier, int i)
            throws OperationManagementException {
        return null;
    }

    @Override
    public List<? extends Operation> getOperationsByDeviceAndStatus(DeviceIdentifier deviceIdentifier,
                                                                    Operation.Status status)
            throws OperationManagementException, DeviceManagementException {
        return null;
    }

    @Override
    public Operation getOperation(String s, int i) throws OperationManagementException {
        return null;
    }

    @Override
    public Activity getOperationByActivityId(String s) throws OperationManagementException {
        return null;
    }

    @Override
    public List<Activity> getOperationByActivityIds(List<String> list) throws OperationManagementException {
        return null;
    }

    @Override
    public Activity getOperationByActivityIdAndDevice(String s, DeviceIdentifier deviceIdentifier)
            throws OperationManagementException {
        return null;
    }

    @Override
    public List<Activity> getActivitiesUpdatedAfter(long l, int i, int i1) throws OperationManagementException {
        return null;
    }

    @Override public List<Activity> getFilteredActivities(String operationCode, int limit, int offset)
            throws OperationManagementException {
        return null;
    }

    @Override public int getTotalCountOfFilteredActivities(String operationCode) throws OperationManagementException {
        return 0;
    }

    @Override
    public List<Activity> getActivitiesUpdatedAfterByUser(long l, String s, int i, int i1)
            throws OperationManagementException {
        return null;
    }

    @Override
    public int getActivityCountUpdatedAfter(long l) throws OperationManagementException { return 0; }

    @Override
    public int getActivityCountUpdatedAfterByUser(long l, String s) throws OperationManagementException { return 0; }

    @Override
    public List<MonitoringOperation> getMonitoringOperationList(String s) {
        return null;
    }

    @Override
    public List<String> getStartupOperations(String s) {
        return null;
    }

    @Override
    public int getDeviceMonitoringFrequency(String s) {
        return 0;
    }

    @Override
    public OperationMonitoringTaskConfig getDeviceMonitoringConfig(String s) {
        return null;
    }

    @Override
    public StartupOperationConfig getStartupOperationConfig(String s) {
        return null;
    }

    @Override
    public boolean isDeviceMonitoringEnabled(String s) {
        return false;
    }

    @Override
    public PolicyMonitoringManager getPolicyMonitoringManager(String s) {
        return null;
    }

    @Override
    public boolean changeDeviceStatus(DeviceIdentifier deviceIdentifier, EnrolmentInfo.Status status)
            throws DeviceManagementException {
        return false;
    }

    @Override
    public void registerDeviceType(DeviceManagementService deviceManagementService) throws DeviceManagementException {
    }

    @Override
    public DeviceType getDeviceType(String s) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<DeviceType> getDeviceTypes() throws DeviceManagementException {
        return null;
    }

    @Override
    public List<DeviceType> getDeviceTypes(PaginationRequest paginationRequest) throws DeviceManagementException {
        return null;
    }

    @Override
    public List<DeviceLocationHistorySnapshot> getDeviceLocationInfo(DeviceIdentifier deviceIdentifier, long l, long l1)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public void notifyPullNotificationSubscriber(Device device, Operation operation)
            throws PullNotificationExecutionFailedException {
    }

    @Override
    public List<Integer> getDeviceEnrolledTenants() throws DeviceManagementException {
        return null;
    }

    @Override
    public List<GeoCluster> findGeoClusters(GeoQuery geoQuery) throws DeviceManagementException {
        return null;
    }



    @Override
    public int getDeviceCountOfTypeByStatus(String s, String s1) throws DeviceManagementException {
        return 0;
    }

    @Override
    public List<String> getDeviceIdentifiersByStatus(String s, String s1) throws DeviceManagementException {
        return null;
    }

    @Override
    public boolean bulkUpdateDeviceStatus(String s, List<String> list, String s1) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean updateEnrollment(String s, boolean b, List<String> list)
            throws DeviceManagementException, UserNotFoundException, InvalidDeviceException {
        return false;
    }

    @Override
    public boolean addDeviceTypeVersion(DeviceTypeVersion deviceTypeVersion) throws DeviceManagementException {
        return false;
    }

    @Override
    public List<DeviceTypeVersion> getDeviceTypeVersions(String s) throws DeviceManagementException {
        return null;
    }

    @Override
    public boolean updateDeviceTypeVersion(DeviceTypeVersion deviceTypeVersion) throws DeviceManagementException {
        return false;
    }

    @Override
    public boolean isDeviceTypeVersionChangeAuthorized(String s, String s1) throws DeviceManagementException {
        return false;
    }

    @Override
    public DeviceTypeVersion getDeviceTypeVersion(String s, String s1) throws DeviceManagementException {
        return null;
    }

    @Override
    public boolean deleteDeviceTypeVersions(DeviceType deviceType) throws DeviceManagementException {
        return false;
    }

    @Override
    public void disEnrollDevices(List<Device> list) throws DeviceManagementException {

    }

    @Override
    public boolean deleteDeviceType(String s, DeviceType deviceType) throws DeviceManagementException {
        return false;
    }

    @Override
    public DeviceConfiguration getDeviceConfiguration(Map<String, String> map)
            throws DeviceManagementException, DeviceNotFoundException, UnauthorizedDeviceAccessException,
            AmbiguousConfigurationException {
        return null;
    }

    @Override
    public List<String> transferDeviceToTenant(DeviceTransferRequest deviceTransferRequest)
            throws DeviceManagementException, DeviceNotFoundException {
        return null;
    }

    @Override
    public PaginationResult getAppSubscribedDevices(PaginationRequest paginationRequest, List<Integer> list) throws DeviceManagementException {
        return null;
    }


    @Override
    public PaginationResult getApplications(PaginationRequest paginationRequest)
            throws ApplicationManagementException, DeviceTypeNotFoundException {
        return null;
    }

    @Override
    public List<String> getAppVersions(String s) throws ApplicationManagementException { return null; }

    @Override
    public int getFunctioningDevicesInSystem() throws DeviceManagementException { return 0; }

    @Override
    public boolean isOperationExist(DeviceIdentifier deviceIdentifier, int i) throws OperationManagementException {
        return false;
    }

    @Override
    public List<Device> getDeviceByIdList(List<String> list) throws DeviceManagementException {
        return null;
    }

    @Override
    public DeviceEnrollmentInvitationDetails getDeviceEnrollmentInvitationDetails(String s) { return null; }

    @Override
    public void triggerCorrectiveActions(String s, String s1, List<String> list, List<ConfigurationEntry> list1)
            throws DeviceManagementException, DeviceNotFoundException {

    }

    @Override
    public List<Device> getDevicesByIdentifiersAndStatuses(List<String> list, List<EnrolmentInfo.Status> list1)
            throws DeviceManagementException {
        return null;
    }

    @Override
    public List<Activity> getActivities(ActivityPaginationRequest activityPaginationRequest)
            throws OperationManagementException {
        return null;
    }

    @Override
    public int getActivitiesCount(ActivityPaginationRequest activityPaginationRequest)
            throws OperationManagementException {
        return 0;
    }

    @Override
    public License getLicenseConfig(String s) throws DeviceManagementException { return null; }

    @Override
    public PaginationResult getDevicesDetails(PaginationRequest paginationRequest, List<Integer> list, String s) throws DeviceManagementException {
        return null;
    }
}
