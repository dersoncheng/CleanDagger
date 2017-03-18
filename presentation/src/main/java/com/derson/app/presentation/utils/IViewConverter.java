package com.derson.app.presentation.utils;

/**
 * Created by yishengcl on 17/3/18.
 */

public interface IViewConverter<PO,VO> {

    void convert(PO po, VO vo);
}
