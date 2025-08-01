/*
 Generated by org.infinispan.protostream.annotations.impl.processor.MarshallerSourceCodeGenerator
 for class Item
*/

package org.infinispan.protostream.domain.schema;

import org.infinispan.protostream.GeneratedMarshallerBase;
import org.infinispan.protostream.domain.Item;

@SuppressWarnings("all")
public final class ItemMarshaller extends GeneratedMarshallerBase implements org.infinispan.protostream.ProtobufTagMarshaller<Item> {

   @Override
   public Class<Item> getJavaClass() { return Item.class; }
   
   @Override
   public String getTypeName() { return "Item"; }
   
   @Override
   public Item read(ReadContext $1) throws java.io.IOException {
      final org.infinispan.protostream.TagReader $in = $1.getReader();
      String __v$1 = null;
      byte[] __v$2 = null;
      java.util.ArrayList __c$3 = null;
      float[] __a$3 = new float[0];
      java.util.ArrayList __c$4 = null;
      int[] __a$4 = new int[0];
      String __v$5 = null;
      boolean done = false;
      while (!done) {
         final int tag = $in.readTag();
         switch (tag) {
            case 0: {
               done = true;
               break;
            }
            case (1 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$1 = $in.readString();
               break;
            }
            case (2 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$2 = $in.readByteArray();
               break;
            }
            case (3 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_FIXED32): {
               float __v$3 = $in.readFloat();
               if (__c$3 == null) __c$3 = new java.util.ArrayList();
               __c$3.add(Float.valueOf(__v$3));
               break;
            }
            case (4 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               int __v$4 = $in.readInt32();
               if (__c$4 == null) __c$4 = new java.util.ArrayList();
               __c$4.add(Integer.valueOf(__v$4));
               break;
            }
            case (5 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$5 = $in.readString();
               break;
            }
            default: {
               if (!$in.skipField(tag)) done = true;
            }
         }
      }
      if (__c$3 != null) {
         __a$3 = new float[__c$3.size()];
         int _j = 0;
         for (java.util.Iterator _it = __c$3.iterator(); _it.hasNext();) __a$3[_j++] = ((Float) _it.next()).floatValue();
      } else {
         __a$3 = new float[0];
      }
      
      if (__c$4 != null) {
         __a$4 = new int[__c$4.size()];
         int _j = 0;
         for (java.util.Iterator _it = __c$4.iterator(); _it.hasNext();) __a$4[_j++] = ((Integer) _it.next()).intValue();
      } else {
         __a$4 = new int[0];
      }
      
      return new Item(__v$1, __v$2, __a$3, __a$4, __v$5);
   }
   
   @Override
   public void write(WriteContext $1, Item $2) throws java.io.IOException {
      final org.infinispan.protostream.TagWriter $out = $1.getWriter();
      final Item o = (Item) $2;
      {
         final String __v$1 = o.getCode();
         if (__v$1 != null) $out.writeString(1, __v$1);
      }
      {
         final byte[] __v$2 = o.getByteVector();
         if (__v$2 != null) $out.writeBytes(2, __v$2);
      }
      {
         final float[] __a$3 = o.getFloatVector();
         if (__a$3 != null) 
            for (int i = 0; i < __a$3.length; i++) {
               final float __v$3 = __a$3[i];
               $out.writeFloat(3, __v$3);
            }
      }
      {
         final int[] __a$4 = o.getIntegerVector();
         if (__a$4 != null) 
            for (int i = 0; i < __a$4.length; i++) {
               final int __v$4 = __a$4[i];
               $out.writeInt32(4, __v$4);
            }
      }
      {
         final String __v$5 = o.getBuggy();
         if (__v$5 != null) $out.writeString(5, __v$5);
      }
   }
}
