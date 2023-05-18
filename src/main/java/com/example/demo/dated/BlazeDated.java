package com.example.demo.dated;


import com.example.demo.domain.BlazeDomain;

import java.time.Instant;

public interface BlazeDated<ROOT> extends BlazeDomain<ROOT> {

    /**
     * Gets created date.
     *
     * @return Date
     */
    Instant getCreated();

    /**
     * Gets date of last update.
     *
     * @return Date
     */
    Instant getUpdated();

    /**
     * Gets date of deletion.
     *
     * @return Date
     */
    Instant getDeleted();
}
