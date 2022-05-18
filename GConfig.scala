package ICache

import chisel3.util._


object GConfig {
    /** xlen the regfile bitWid */
    val xlen = 64
    /** fetch Ibus the pc bitWid  */
    val pcWid = 40
}


trait ICacheConfig{
    /** the wid of core fetch addr */
    val fetchAddrWid = GConfig.pcWid
    /** the wid of core fetch data */
    val fetchWid = 128
    /********************************************/
    /** the wid of cacheline_data bit  */
    val cacheLineWid = fetchWid
    /** the number of cacheline */
    val lineNums = 16
    /** the number of cacheway */
    val wayNums = 8
    /** the wid of offset bit */
    val offsetWid = log2Up(cacheLineWid/8) //4
    /** the wid of index bit */
    val indexWid = log2Up(lineNums) // 2
    /** the wid of tag bit */
    val tagWid = fetchAddrWid - indexWid - offsetWid
}


trait L2Config{
    val l2addrwid = 40
    val l2datawid = 128
}
