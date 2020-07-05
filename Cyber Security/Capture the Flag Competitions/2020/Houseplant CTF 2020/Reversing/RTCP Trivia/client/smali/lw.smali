.class public final enum Llw;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llw;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Llw;

.field public static final enum b:Llw;

.field public static final enum c:Llw;

.field public static final enum d:Llw;

.field public static final enum e:Llw;

.field public static final enum f:Llw;

.field public static final enum g:Llw;

.field public static final enum h:Llw;

.field public static final enum i:Llw;

.field public static final enum j:Llw;

.field public static final enum k:Llw;

.field private static final synthetic m:[Llw;


# instance fields
.field public final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Llw;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->a:Llw;

    new-instance v0, Llw;

    const-string v1, "PROTOCOL_ERROR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->b:Llw;

    new-instance v0, Llw;

    const-string v1, "INTERNAL_ERROR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->c:Llw;

    new-instance v0, Llw;

    const-string v1, "FLOW_CONTROL_ERROR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5, v5}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->d:Llw;

    new-instance v0, Llw;

    const-string v1, "REFUSED_STREAM"

    const/4 v6, 0x4

    const/4 v7, 0x7

    invoke-direct {v0, v1, v6, v7}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->e:Llw;

    new-instance v0, Llw;

    const-string v1, "CANCEL"

    const/4 v8, 0x5

    const/16 v9, 0x8

    invoke-direct {v0, v1, v8, v9}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->f:Llw;

    new-instance v0, Llw;

    const-string v1, "COMPRESSION_ERROR"

    const/4 v10, 0x6

    const/16 v11, 0x9

    invoke-direct {v0, v1, v10, v11}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->g:Llw;

    new-instance v0, Llw;

    const-string v1, "CONNECT_ERROR"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v7, v12}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->h:Llw;

    new-instance v0, Llw;

    const-string v1, "ENHANCE_YOUR_CALM"

    const/16 v13, 0xb

    invoke-direct {v0, v1, v9, v13}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->i:Llw;

    new-instance v0, Llw;

    const-string v1, "INADEQUATE_SECURITY"

    const/16 v14, 0xc

    invoke-direct {v0, v1, v11, v14}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->j:Llw;

    new-instance v0, Llw;

    const-string v1, "HTTP_1_1_REQUIRED"

    const/16 v14, 0xd

    invoke-direct {v0, v1, v12, v14}, Llw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Llw;->k:Llw;

    new-array v0, v13, [Llw;

    sget-object v1, Llw;->a:Llw;

    aput-object v1, v0, v2

    sget-object v1, Llw;->b:Llw;

    aput-object v1, v0, v3

    sget-object v1, Llw;->c:Llw;

    aput-object v1, v0, v4

    sget-object v1, Llw;->d:Llw;

    aput-object v1, v0, v5

    sget-object v1, Llw;->e:Llw;

    aput-object v1, v0, v6

    sget-object v1, Llw;->f:Llw;

    aput-object v1, v0, v8

    sget-object v1, Llw;->g:Llw;

    aput-object v1, v0, v10

    sget-object v1, Llw;->h:Llw;

    aput-object v1, v0, v7

    sget-object v1, Llw;->i:Llw;

    aput-object v1, v0, v9

    sget-object v1, Llw;->j:Llw;

    aput-object v1, v0, v11

    sget-object v1, Llw;->k:Llw;

    aput-object v1, v0, v12

    sput-object v0, Llw;->m:[Llw;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Llw;->l:I

    return-void
.end method

.method public static a(I)Llw;
    .locals 5

    invoke-static {}, Llw;->values()[Llw;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    iget v4, v3, Llw;->l:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Llw;
    .locals 1

    const-class v0, Llw;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llw;

    return-object p0
.end method

.method public static values()[Llw;
    .locals 1

    sget-object v0, Llw;->m:[Llw;

    invoke-virtual {v0}, [Llw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llw;

    return-object v0
.end method
