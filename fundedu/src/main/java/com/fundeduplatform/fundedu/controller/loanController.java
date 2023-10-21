package com.fundeduplatform.fundedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.is.dlos.app.dto.LoanApplicationWrapperDTO;
import com.is.dlos.app.dto.LoanStageDTO;
import com.is.dlos.app.service.LoanService;

@RestController
@RequestMapping(value = "/funded/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoanController {
    @Autowired
    //LoanService loanService;


    @PostMapping("/submitLoanApplications")
    public Object SubmitLoanApplication(@RequestBody Object loanApplicationWrapperDTO){
        return loanService.getSubmittedApplications(loanApplicationWrapperDTO);
    }

    @GetMapping("/getApplicationsOfStudent")
    public Object getsentbackApplications(@RequestBody Long studentId){
        return loanService.getsentbackApplications(loanApplicationWrapperDTO);
    }


    @GetMapping("/getSavedLoanApplications")
    public Object getSavedApplication(@RequestBody Object loanApplicationWrapperDTO){
        return loanService.getSavedApplications(loanApplicationWrapperDTO);
    }


}
