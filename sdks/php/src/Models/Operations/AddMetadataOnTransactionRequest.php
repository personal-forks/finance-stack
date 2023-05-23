<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace formance\stack\Models\Operations;

use \formance\stack\Utils\SpeakeasyMetadata;
class AddMetadataOnTransactionRequest
{
    /**
     * Use an idempotency key
     * 
     * @var ?string $idempotencyKey
     */
	#[SpeakeasyMetadata('header:style=simple,explode=false,name=Idempotency-Key')]
    public ?string $idempotencyKey = null;
    
    /**
     * metadata
     * 
     * @var ?array<string, string> $requestBody
     */
	#[SpeakeasyMetadata('request:mediaType=application/json')]
    public ?array $requestBody = null;
    
    /**
     * Set async mode.
     * 
     * @var ?bool $async
     */
	#[SpeakeasyMetadata('queryParam:style=form,explode=true,name=async')]
    public ?bool $async = null;
    
    /**
     * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     * 
     * @var ?bool $dryRun
     */
	#[SpeakeasyMetadata('queryParam:style=form,explode=true,name=dryRun')]
    public ?bool $dryRun = null;
    
    /**
     * Name of the ledger.
     * 
     * @var string $ledger
     */
	#[SpeakeasyMetadata('pathParam:style=simple,explode=false,name=ledger')]
    public string $ledger;
    
    /**
     * Transaction ID.
     * 
     * @var int $txid
     */
	#[SpeakeasyMetadata('pathParam:style=simple,explode=false,name=txid')]
    public int $txid;
    
	public function __construct()
	{
		$this->idempotencyKey = null;
		$this->requestBody = null;
		$this->async = null;
		$this->dryRun = null;
		$this->ledger = "";
		$this->txid = 0;
	}
}