package org.sid.fidecoin.security;

public interface SecurityParams {

    public static final String JWT_HEADER_NAME="Authorization";
    public static final String SECRET="kkhenissi@fidecoin.com";
    public static final long EXPIRATION=100*24*3600*10000;
    public static final String HEADER_PREFIX="Bearer ";
}
