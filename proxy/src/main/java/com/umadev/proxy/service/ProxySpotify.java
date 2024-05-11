package com.umadev.proxy.service;

import com.umadev.proxy.model.TypeOfUser;
import com.umadev.proxy.model.User;

public class ProxySpotify implements Spotify {

  private Spotify spotify;

  public ProxySpotify() {
    this.spotify = new SpotifyImpl();
  }

  @Override
  public String download(User user) {
    boolean notAuthenticated = !user.getTypeOfUser().equals(TypeOfUser.PREMIUM);
    if (notAuthenticated) {
      return "Your are not authenticated";
    }

    return spotify.download(user);
  }
}
