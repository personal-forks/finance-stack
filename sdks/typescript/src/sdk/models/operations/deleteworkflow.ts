/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";
import { AxiosResponse } from "axios";

export class DeleteWorkflowRequest extends SpeakeasyBase {
  /**
   * The flow id
   */
  @SpeakeasyMetadata({
    data: "pathParam, style=simple;explode=false;name=flowId",
  })
  flowId: string;
}

export class DeleteWorkflowResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  /**
   * General error
   */
  @SpeakeasyMetadata()
  error?: shared.ErrorT;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  rawResponse?: AxiosResponse;
}