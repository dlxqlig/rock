package org.flybird.rock.portal.service;

import org.flybird.rock.portal.domain.MemberProductCollection;

import java.util.List;

/**
 * 会员收藏Service
 * Created by flybird on 2018/8/2.
 */
public interface MemberCollectionService {
    int addProduct(MemberProductCollection productCollection);

    int deleteProduct(Long memberId, Long productId);

    List<MemberProductCollection> listProduct(Long memberId);
}
