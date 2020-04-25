.class public interface abstract Ljp;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljp$1;

    invoke-direct {v0}, Ljp$1;-><init>()V

    sput-object v0, Ljp;->a:Ljp;

    return-void
.end method


# virtual methods
.method public abstract a()Lkl;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
