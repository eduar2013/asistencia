package com.decj.asistencia.auth.jwt.resourse;

import java.io.Serializable;

public class JwtTokenResponse implements Serializable {

  private static final long serialVersionUID = 8317676219297719109L;

  private final String token;
  private boolean ok;
  private String name;
  private String msg;

    public JwtTokenResponse(String token) {
        this.token = token;
    }

    public void setOk(boolean ok) {
		this.ok = ok;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getToken() {
        return this.token;
    }

	public boolean isOk() {
		return ok;
	}

	public String getName() {
		return name;
	}

	public String getMsg() {
		return msg;
	}
}