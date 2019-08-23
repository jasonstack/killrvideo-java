package com.killrvideo.service.video.dto;

import java.util.Date;
import java.util.UUID;

import com.datastax.oss.driver.api.mapper.annotations.ClusteringColumn;
import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.killrvideo.dse.dto.AbstractVideo;

/**
 * Pojo representing multiple videso.
 *
 * @author DataStax Developer Advocates team.
 */
public abstract class VideoPreview extends AbstractVideo {

    /** Serial. */
    private static final long serialVersionUID = 1319627901957309436L;
    
    @ClusteringColumn
    @CqlName(VIDEOS_COLUMN_ADDED_DATE)
    private Date addedDate;

    @ClusteringColumn(1)
    @CqlName(VIDEOS_COLUMN_VIDEOID)
    private UUID videoid;
    
    /**
     * Allow default initializations.
     */
    public VideoPreview() {}

    /**
     * Constructor used by sub entities.
     */
    protected VideoPreview(String name, String preview, Date addedDate, UUID videoid) {
        super(name, preview);
        this.addedDate = addedDate;
        this.videoid   = videoid;
    }

    /**
     * Getter for attribute 'addedDate'.
     *
     * @return
     *       current value of 'addedDate'
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Setter for attribute 'addedDate'.
     * @param addedDate
     *      new value for 'addedDate '
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Getter for attribute 'videoid'.
     *
     * @return
     *       current value of 'videoid'
     */
    public UUID getVideoid() {
        return videoid;
    }

    /**
     * Setter for attribute 'videoid'.
     * @param videoid
     *      new value for 'videoid '
     */
    public void setVideoid(UUID videoid) {
        this.videoid = videoid;
    }
    
}