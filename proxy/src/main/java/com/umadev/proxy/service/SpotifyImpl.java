package com.umadev.proxy.service;

import com.umadev.proxy.model.User;

public class SpotifyImpl implements Spotify {

  @Override
  public String download(User user) {
    return "Hi " + user.getName() + "! Downloading your song";
  }
}
