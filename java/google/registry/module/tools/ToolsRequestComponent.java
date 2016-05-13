// Copyright 2016 The Domain Registry Authors. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.domain.registry.module.tools;

import com.google.domain.registry.export.PublishDetailReportAction;
import com.google.domain.registry.loadtest.LoadTestAction;
import com.google.domain.registry.loadtest.LoadTestModule;
import com.google.domain.registry.mapreduce.MapreduceModule;
import com.google.domain.registry.request.RequestModule;
import com.google.domain.registry.request.RequestScope;
import com.google.domain.registry.tools.server.CreateGroupsAction;
import com.google.domain.registry.tools.server.CreatePremiumListAction;
import com.google.domain.registry.tools.server.DeleteEntityAction;
import com.google.domain.registry.tools.server.DeleteProberDataAction;
import com.google.domain.registry.tools.server.GenerateZoneFilesAction;
import com.google.domain.registry.tools.server.KillAllCommitLogsAction;
import com.google.domain.registry.tools.server.KillAllCrossTldEntitiesAction;
import com.google.domain.registry.tools.server.KillAllEppResourcesAction;
import com.google.domain.registry.tools.server.ListDomainsAction;
import com.google.domain.registry.tools.server.ListHostsAction;
import com.google.domain.registry.tools.server.ListPremiumListsAction;
import com.google.domain.registry.tools.server.ListRegistrarsAction;
import com.google.domain.registry.tools.server.ListReservedListsAction;
import com.google.domain.registry.tools.server.ListTldsAction;
import com.google.domain.registry.tools.server.ResaveAllEppResourcesAction;
import com.google.domain.registry.tools.server.ToolsServerModule;
import com.google.domain.registry.tools.server.UpdatePremiumListAction;
import com.google.domain.registry.tools.server.VerifyOteAction;
import com.google.domain.registry.tools.server.javascrap.BackfillAutorenewBillingFlagAction;
import com.google.domain.registry.tools.server.javascrap.CountRecurringBillingEventsAction;

import dagger.Subcomponent;

/** Dagger component with per-request lifetime for "tools" App Engine module. */
@RequestScope
@Subcomponent(
    modules = {
        LoadTestModule.class,
        MapreduceModule.class,
        RequestModule.class,
        ToolsServerModule.class,
    })
interface ToolsRequestComponent {
  BackfillAutorenewBillingFlagAction backfillAutorenewBillingFlagAction();
  CountRecurringBillingEventsAction countRecurringBillingEventsAction();
  CreateGroupsAction createGroupsAction();
  CreatePremiumListAction createPremiumListAction();
  DeleteEntityAction deleteEntityAction();
  DeleteProberDataAction deleteProberDataAction();
  GenerateZoneFilesAction generateZoneFilesAction();
  KillAllCommitLogsAction killAllCommitLogsAction();
  KillAllCrossTldEntitiesAction killAllCrossTldEntitiesAction();
  KillAllEppResourcesAction killAllEppResourcesAction();
  ListDomainsAction listDomainsAction();
  ListHostsAction listHostsAction();
  ListPremiumListsAction listPremiumListsAction();
  ListRegistrarsAction listRegistrarsAction();
  ListReservedListsAction listReservedListsAction();
  ListTldsAction listTldsAction();
  LoadTestAction loadTestAction();
  PublishDetailReportAction publishDetailReportAction();
  ResaveAllEppResourcesAction resaveAllEppResourcesAction();
  UpdatePremiumListAction updatePremiumListAction();
  VerifyOteAction verifyOteAction();
}