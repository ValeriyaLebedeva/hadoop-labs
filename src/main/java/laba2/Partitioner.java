package laba2;
package org.apache.hadoop.mapreduce;

public abstract class Partitioner<KEY, VALUE> {
    public abstract int getPartition(KEY key, VALUE value, int numPartitions);

}
