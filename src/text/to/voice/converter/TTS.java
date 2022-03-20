/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.to.voice.converter;

/**
 *
 * @author Mainul Hassan
 */
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class TTS {
    VoiceManager freettsVM;
    Voice freettsVoice;
        public TTS(String words, String voiceName) {

        System.setProperty("mbrola.base", "C:\\mbrola");
        freettsVM = VoiceManager.getInstance();

        freettsVoice = freettsVM.getVoice(voiceName);
        freettsVoice.allocate();
        speakWord(words);
    }
    public void speakWord(String words) {
        freettsVoice.speak(words);
    }
}
