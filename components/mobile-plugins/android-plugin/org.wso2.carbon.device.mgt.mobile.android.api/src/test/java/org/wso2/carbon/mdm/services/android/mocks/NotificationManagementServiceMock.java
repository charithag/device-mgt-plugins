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

package org.wso2.carbon.mdm.services.android.mocks;

import org.wso2.carbon.device.mgt.common.Device;
import org.wso2.carbon.device.mgt.common.DeviceIdentifier;
import org.wso2.carbon.device.mgt.common.PaginationRequest;
import org.wso2.carbon.device.mgt.common.PaginationResult;
import org.wso2.carbon.device.mgt.common.notification.mgt.Notification;
import org.wso2.carbon.device.mgt.common.notification.mgt.NotificationManagementException;
import org.wso2.carbon.device.mgt.common.notification.mgt.NotificationManagementService;

import java.util.List;

public class NotificationManagementServiceMock implements NotificationManagementService {
    @Override
    public boolean addNotification(DeviceIdentifier deviceIdentifier, Notification notification)
            throws NotificationManagementException {
        return false;
    }

    @Override
    public boolean addNotification(Device device, Notification notification) throws NotificationManagementException {
        return false;
    }

    @Override
    public boolean updateNotification(Notification notification) throws NotificationManagementException {
        return false;
    }

    @Override
    public boolean updateNotificationStatus(int i, Notification.Status status) throws NotificationManagementException {
        return false;
    }

    @Override public boolean updateAllNotifications(Notification.Status status, int tenantID)
            throws NotificationManagementException {
        return false;
    }

    @Override
    public List<Notification> getAllNotifications() throws NotificationManagementException {
        return null;
    }

    @Override
    public Notification getNotification(int i) throws NotificationManagementException {
        return null;
    }

    @Override
    public PaginationResult getAllNotifications(PaginationRequest paginationRequest)
            throws NotificationManagementException {
        return null;
    }

    @Override
    public List<Notification> getNotificationsByStatus(Notification.Status status)
            throws NotificationManagementException {
        return null;
    }

    @Override
    public PaginationResult getNotificationsByStatus(Notification.Status status, PaginationRequest paginationRequest)
            throws NotificationManagementException {
        return null;
    }
}
