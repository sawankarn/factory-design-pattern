package com.hcl.demo.factory;

import com.hcl.demo.communication.EmailCommunication;
import com.hcl.demo.communication.MobileCommunication;
import com.hcl.demo.repository.Communication;

public class CommunicationFactory {
    public Communication getProcess(String modeOfCommunication){
        if("email".equalsIgnoreCase(modeOfCommunication)){
            return new EmailCommunication();
        }
        else if("mobile".equalsIgnoreCase(modeOfCommunication)){
            return new MobileCommunication();
        }
        return null;
    }
}
