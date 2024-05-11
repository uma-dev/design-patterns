package com.umadev.proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.umadev.proxy.model.TypeOfUser;
import com.umadev.proxy.model.User;
import com.umadev.proxy.service.ProxySpotify;
import com.umadev.proxy.service.Spotify;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxyApplicationTests {

  @Test
  void userCannotDownloadSong() {
    User user = new User(TypeOfUser.FREE, "username");
    Spotify spotifyService = new ProxySpotify();
    String result = spotifyService.download(user);
    String expected = "Your are not authenticated";
    assertEquals(expected, result);
  }

  @Test
  void userCanDownloadSong() {
    User user = new User(TypeOfUser.PREMIUM, "username");
    Spotify spotifyService = new ProxySpotify();
    String result = spotifyService.download(user);
    String expected = "Hi " + user.getName() + "! Downloading your song";
    assertEquals(expected, result);
  }
}
