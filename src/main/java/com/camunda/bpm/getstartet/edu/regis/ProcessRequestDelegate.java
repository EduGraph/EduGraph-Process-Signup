/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camunda.bpm.getstartet.edu.regis;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 *
 * @author Pliskin
 */
public class ProcessRequestDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("REGIS-REQUESTS");

    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("Processing request by'" + execution.getVariable("facultyName") + "'...");
    }
}
