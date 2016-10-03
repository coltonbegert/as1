# as1
CMPUT 301 Assignment 1 submission

#Video
https://youtu.be/-miE3R28HaI




#About
This program is composed of one activity that has a recycler view. This view get data from the model through Habit Manager and turns it into a list view through HabitAdapter.
There is a nested recyclerview int the habitview that shows the past completions of habits through an expandable window.
The toggles for the repeating days are also their own recyclerview and are created in DayToggleAdapter.
the final aspect is the popup window for entering the name of the habit through the FAB.

# Sources
This is my source list -> All uses are labeled and small things will be cited in the code.

https://guides.codepath.com/android/Heterogenous-Layouts-inside-RecyclerView
// used in the creation of the Habit Adapter, ViewHolder and the implementaion into the MainActivity.
// The guide was used as inspiration as well as an explanation of the workings of a recyclerview
// The code from the guide is open source as stated in the websites homepage and is designed to provide easy access to code snipets and explanations


http://stackoverflow.com/questions/29698436/how-to-handle-multiple-layout-clicks-in-recyclerview-in-android
// used in habit adapter to implement onClickListeners in recyclerviews

http://stackoverflow.com/questions/18598255/android-create-a-toggle-button-with-image-and-no-text
// used in expander_icon to make the dropdown arrow


http://stackoverflow.com/questions/14981233/android-arraylist-of-custom-objects-save-to-sharedpreferences-serializable
// used to save and load the file

http://stackoverflow.com/questions/4134117/edittext-on-a-popup-window
// used in EditTextPopup



