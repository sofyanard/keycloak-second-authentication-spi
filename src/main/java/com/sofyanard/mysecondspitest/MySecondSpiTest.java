package com.sofyanard.mysecondspitest;

import javax.ws.rs.core.UriInfo;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.AuthenticationFlowError;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.actiontoken.DefaultActionToken;
import org.keycloak.common.util.Time;
import org.keycloak.events.Errors;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserCredentialModel;
import org.keycloak.models.UserModel;
import org.keycloak.models.credential.PasswordUserCredentialModel;
import org.keycloak.models.credential.OTPCredentialModel;
import org.keycloak.models.utils.HmacOTP;
import org.keycloak.services.managers.AuthenticationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySecondSpiTest  implements Authenticator {

    private static final Logger log = LoggerFactory.getLogger(MySecondSpiTest.class);

    public void authenticate(AuthenticationFlowContext authenticationFlowContext) {

        // reset previously failed flow
        authenticationFlowContext.resetFlow();

        log.info("just want to write a log !!!");

        authenticationFlowContext.success();
    }

    public void action(AuthenticationFlowContext authenticationFlowContext) {
        authenticationFlowContext.success();
    }

    public boolean requiresUser() {
        return false;
    }

    public boolean configuredFor(KeycloakSession keycloakSession, RealmModel realmModel, UserModel userModel) {
        return false;
    }

    public void setRequiredActions(KeycloakSession keycloakSession, RealmModel realmModel, UserModel userModel) {

    }

    public void close() {

    }

}