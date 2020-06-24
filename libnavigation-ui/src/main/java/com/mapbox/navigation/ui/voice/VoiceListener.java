package com.mapbox.navigation.ui.voice;

import com.mapbox.api.directions.v5.models.VoiceInstructions;

interface VoiceListener {

  void onStart(SpeechPlayerState state);

  void onDone();

  void onError(String errorText, VoiceInstructions voiceInstructions);
}
