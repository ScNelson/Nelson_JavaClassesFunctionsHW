public class MusicNote {
    private int note;       // MIDI note value 0-127
    private int velocity;   // MIDI velocity (loudness) 0-127
    private int duration;   // Note length in milliseconds

    // Create array containing note String values 
    private String[] noteLetters = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    private String[] noteStr = new String[128];

    private void createNoteStrArray() {
        int currVal = 0;
        for (int i=-2; i <= 8; i++){
            for (int j=0; j < this.noteLetters.length; j++){
                if (currVal > 127) {
                    break;
                }
                this.noteStr[currVal] = this.noteLetters[j] + i;
                currVal++;
            }
        }
    }

    // Empty constructor
    public MusicNote() {
        this.note = 60; //Default to C3
        this.velocity = 60; //Default to medium loudness
        this.duration = 500; //Default to 500ms

        createNoteStrArray();
    }

    // 2 argument constructor
    public MusicNote(int note, int duration) {
        this.note = note;
        this.duration = duration;

        this.velocity = 60; //Default to medium loudness if no specified velocity

        createNoteStrArray();
    }

    // 3 argument (all variables) constructor
    public MusicNote(int note, int velocity, int duration) {
        this.note = note;
        this.velocity = velocity;
        this.duration = duration;

        createNoteStrArray();
    }

    /*********** Getters ***********/
    public int getNoteValue() {
        return this.note;
    }
    public int getVelocity() {
        return this.velocity;
    }
    public int getDuration() {
        return this.duration;
    }

    /*********** Setters ***********/
    public void setNoteValue(int note) {
        if (note > 0 && note < 128) {
            this.note = note;
        }
    }
    public void setVelocity(int velocity) {
        if (velocity > 0 && velocity < 128) {
            this.velocity = velocity;
        }
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Method returning boolean for if the note is loud
    public boolean isLoud() {
        if (velocity > 100) {
            return true;
        } else {
            return false;
        }
    }

    // Method returning String value of the note name (instead of MIDI 0-127 value)
    public String noteString() {
        return this.noteStr[note];
    }

}
