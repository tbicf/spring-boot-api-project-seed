package com.gsunis.project.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gsunis.project.core.Result;
import com.gsunis.project.core.ResultGenerator;
import com.gsunis.project.model.QrCodeServiceEvaluation;
import com.gsunis.project.service.QrCodeServiceEvaluationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/04/08.
 */
@RestController
@RequestMapping("/qr/code/evaluation")
public class QrCodeServiceEvaluationController {

    @Resource
    private QrCodeServiceEvaluationService qrCodeServiceEvaluationService;

    @PostMapping("/add")
    public Result add(QrCodeServiceEvaluation qrCodeServiceEvaluation) {
        qrCodeServiceEvaluationService.save(qrCodeServiceEvaluation);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        qrCodeServiceEvaluationService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(QrCodeServiceEvaluation qrCodeServiceEvaluation) {
        qrCodeServiceEvaluationService.update(qrCodeServiceEvaluation);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        QrCodeServiceEvaluation qrCodeServiceEvaluation = qrCodeServiceEvaluationService.findById(id);
        return ResultGenerator.genSuccessResult(qrCodeServiceEvaluation);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<QrCodeServiceEvaluation> list = qrCodeServiceEvaluationService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
