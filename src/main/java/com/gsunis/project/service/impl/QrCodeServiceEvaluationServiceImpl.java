package com.gsunis.project.service.impl;

import com.gsunis.project.dao.QrCodeServiceEvaluationMapper;
import com.gsunis.project.model.QrCodeServiceEvaluation;
import com.gsunis.project.service.QrCodeServiceEvaluationService;
import com.gsunis.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/08.
 */
@Service
@Transactional
public class QrCodeServiceEvaluationServiceImpl extends AbstractService<QrCodeServiceEvaluation> implements QrCodeServiceEvaluationService {
    @Resource
    private QrCodeServiceEvaluationMapper busiQrcodeServiceEvaluationMapper;

}
