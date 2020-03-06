package com.example.springbootdemo.model.audit;

public enum AuditType {
    USER_LOGIN {
        @Override
        public String getDescription(Object auditData) {
            return "User Login";
        }
    }, USER_PASSWORD_RESET {
        @Override
        public String getDescription(Object auditData) {
            return "User password reset requested";
        }
    }, USER_DISABLED {
        @Override
        public String getDescription(Object auditData) {
            return "User ["+String.valueOf(auditData)+"] disabled";
        }
    }, USER_LOGOUT {
        @Override
        public String getDescription(Object auditData) {
            return "User Logout";
        }
    };

    public abstract String getDescription(Object auditData);
}
