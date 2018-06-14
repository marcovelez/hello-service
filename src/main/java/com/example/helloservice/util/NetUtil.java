package com.example.helloservice.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetUtil {

	private static final Logger logger = LoggerFactory.getLogger(NetUtil.class);

	public static String getHostName() {
        InetAddress ip;
        String hostname = null;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            logger.debug("Your current IP address <{}>", ip);
            logger.debug("Your current Hostname <{}>", hostname);    
        } catch (UnknownHostException e) {
            logger.warn("Error while trying to get Hostname and IP address <{}>", e.getMessage());
        }
        return hostname;
    }
	
}