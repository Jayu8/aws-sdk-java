/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameServerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object that describes the requested game server resource.
     * </p>
     */
    private GameServer gameServer;

    /**
     * <p>
     * Object that describes the requested game server resource.
     * </p>
     * 
     * @param gameServer
     *        Object that describes the requested game server resource.
     */

    public void setGameServer(GameServer gameServer) {
        this.gameServer = gameServer;
    }

    /**
     * <p>
     * Object that describes the requested game server resource.
     * </p>
     * 
     * @return Object that describes the requested game server resource.
     */

    public GameServer getGameServer() {
        return this.gameServer;
    }

    /**
     * <p>
     * Object that describes the requested game server resource.
     * </p>
     * 
     * @param gameServer
     *        Object that describes the requested game server resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerResult withGameServer(GameServer gameServer) {
        setGameServer(gameServer);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGameServer() != null)
            sb.append("GameServer: ").append(getGameServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGameServerResult == false)
            return false;
        DescribeGameServerResult other = (DescribeGameServerResult) obj;
        if (other.getGameServer() == null ^ this.getGameServer() == null)
            return false;
        if (other.getGameServer() != null && other.getGameServer().equals(this.getGameServer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServer() == null) ? 0 : getGameServer().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameServerResult clone() {
        try {
            return (DescribeGameServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
