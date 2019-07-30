package com.tonikamitv.ambulance;

interface GetUserCallback {

    /**
     * Invoked when background task is completed
     */

    public abstract void done(User returnedUser);
}
