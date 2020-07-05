.class public abstract Lmb$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# static fields
.field public static final m:Lmb$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb$b$1;

    invoke-direct {v0}, Lmb$b$1;-><init>()V

    sput-object v0, Lmb$b;->m:Lmb$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmb;)V
    .locals 0

    return-void
.end method

.method public abstract a(Lmd;)V
.end method
