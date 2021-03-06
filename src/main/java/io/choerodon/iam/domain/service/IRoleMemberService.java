package io.choerodon.iam.domain.service;

import io.choerodon.iam.api.dto.RoleAssignmentDeleteDTO;
import io.choerodon.iam.domain.iam.entity.MemberRoleE;
import io.choerodon.iam.infra.dataobject.MemberRoleDO;

import java.util.List;

/**
 * @author superlee
 * @data 2018/4/2
 */
public interface IRoleMemberService {

    List<MemberRoleE> insertOrUpdateRolesByMemberId(
            Boolean isEdit, Long sourceId, Long memberId, List<MemberRoleE> memberRoleEList, String sourceType);

    void delete(RoleAssignmentDeleteDTO roleAssignmentDeleteDTO, String sourceType);

    void insertAndSendEvent(MemberRoleDO memberRole, String loginName);
}
